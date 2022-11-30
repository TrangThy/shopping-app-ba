package com.example.shoppingapp.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.shoppingapp.R;
import com.example.shoppingapp.databinding.ActivityMainBinding;
import com.example.shoppingapp.model.CartItem;
import com.example.shoppingapp.viewModels.ShopViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    NavController navController;
    ShopViewModel shopViewModel;
    private int cartQuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        //                                    -- OR --
//
//        ViewBinding viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController);

        shopViewModel = new ViewModelProvider(this).get(ShopViewModel.class);

        shopViewModel.getCart().observe(this, new Observer<List<CartItem>>() {
            @Override
            public void onChanged(List<CartItem> cartItems) {

                int quantity = 0;
                for (CartItem cartItem : cartItems) {
                    quantity += cartItem.getQuantity();
                }
                cartQuantity = quantity;
                // gọi phương thức cho menu
                invalidateOptionsMenu();
            }
        });
    }


    // tạo các nút quay lại trong các trang
    @Override
    public boolean onSupportNavigateUp() {
        navController.navigateUp();
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        MenuItem menuItem = menu.findItem(R.id.cartFragmentID);
        //dùng android:actionLayout để hiện thị chế độ xem
        View actionView = menuItem.getActionView();
        TextView cartBadgeTextView = actionView.findViewById(R.id.cart_badge_textview);

        cartBadgeTextView.setText(String.valueOf(cartQuantity));
        cartBadgeTextView.setVisibility(cartQuantity == 0 ? View.GONE : View.VISIBLE);

        actionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // gọi onOptionsItemSeleced method
                onOptionsItemSelected(menuItem);
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        // **Important**
        // ID of menu item should be same as that of fragment (in nav_graph) on which you want to go.

//        onNavigationSelected() already return boolean value So,
//        NavigationUI.onNavDestinationSelected(item, navController);
//        return super.onOptionsItemSelected(item);

        return NavigationUI.onNavDestinationSelected(item, navController) || super.onOptionsItemSelected(item);
    }
}