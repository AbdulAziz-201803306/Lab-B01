package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.ui.AppBarConfiguration
import kotlinx.android.synthetic.main.fragment_visits.*
import kotlinx.android.synthetic.main.visit_list_item.*

class MainActivity : AppCompatActivity(), NavController.OnDestinationChangedListener {
    lateinit var navController : NavController
    var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_visits)
        visitRepository.initVisits(this)
        displayVisit()
        addVisit.setOnClickListener {

        }
    }
    fun displayVisit(){
        visitRepository.apply {
            index = (index + visits.size) % visits.size

            countryName.text = visits[index].name
            amount.text = visits[index].amount.toString()
            ratingBar.numStars = visits[index].rating.hashCode()

            val imageName = visits[index].code
            val imageID =resources.getIdentifier(imageName, "drawable", packageName)
        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when(destination.id){

        }
    }


}