package com.app.medimart.ui.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.app.medimart.R
import com.app.medimart.databinding.ActivityHomeBinding
import com.app.medimart.ui.main.view.ui.home.HomeFragment

class HomeActivity : AppCompatActivity() , View.OnClickListener
{
    private lateinit var binding: ActivityHomeBinding
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        drawerLayout = binding.drawerLayout

        binding.tools.imgmenu.setOnClickListener(View.OnClickListener {
            opencloseDrawer()
        })

        binding.menuDrawer.textHome.setOnClickListener(this)
        binding.menuDrawer.textCategory.setOnClickListener(this)
        binding.menuDrawer.textProfile.setOnClickListener(this)
        binding.menuDrawer.textOrder.setOnClickListener(this)
        binding.menuDrawer.textWishlist.setOnClickListener(this)
        binding.menuDrawer.textCart.setOnClickListener(this)
        binding.menuDrawer.textNotification.setOnClickListener(this)
        binding.menuDrawer.textAbout.setOnClickListener(this)
        binding.menuDrawer.textPrivacyPolicy.setOnClickListener(this)
        binding.menuDrawer.textTermsCondition.setOnClickListener(this)
        binding.menuDrawer.textContact.setOnClickListener(this)
        binding.menuDrawer.textOffer.setOnClickListener(this)
        displayFragment(HomeFragment())
    }

    fun opencloseDrawer()
    {
        if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
            drawerLayout.closeDrawer(Gravity.RIGHT)
        }
        if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
            drawerLayout.closeDrawer(Gravity.LEFT)
        } else {
            drawerLayout.openDrawer(Gravity.LEFT)
        }
    }


    override fun onClick(v: View?) {
        val item_id = v?.id
        when (item_id)
        {
            R.id.text_Home -> {
                Toast.makeText(this, "Home page", Toast.LENGTH_SHORT).show()
                displayFragment(HomeFragment())
            }
            R.id.text_category->callAllCategory()
            R.id.text_profile -> callLogin()

        }
        opencloseDrawer()
    }


    fun displayFragment(fragment: Fragment?) {

        // update the main content by replacing fragments
        if (fragment != null) {
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
        }
    }


    fun callAllCategory()
    {
        val intent:Intent=Intent(this, ProductCategoryActivity::class.java)
        startActivity(intent)
    }
    fun callLogin()
    {
        val intent:Intent=Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}