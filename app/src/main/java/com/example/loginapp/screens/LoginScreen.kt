package com.example.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.loginapp.R
import com.example.loginapp.components.TextFieldOculto
import com.example.loginapp.components.TextFieldPerso
import com.example.loginapp.ui.theme.Github

@Composable
fun LoginScreen(navController: NavController, innePadding: PaddingValues) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var passwordVisibility by remember {
        mutableStateOf(false)
    }
    Box (
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innePadding)
        ) {
            // Logo
            Column (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Icon(
                    imageVector = Github,
                    contentDescription = "Logo",
                    tint = Color.White,
                    modifier = Modifier.size(100.dp)
                )
            }
            // Form
            Card (
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 0.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
                ) {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 38.dp, vertical = 38.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Login",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 28.dp)
                    )
                    // Email Input
                    TextFieldPerso(
                        text = "Email",
                        value = email,
                        onValueChange = { email = it },
                        placeholder = "ejemplo@gmail.com"
                    )

                    // Password Input
                    TextFieldOculto(
                        text = "Password",
                        value = password,
                        onValueChange = { password = it },
                        showPassword = passwordVisibility,
                        onShowPasswordChange = { passwordVisibility = !passwordVisibility }
                    )

                    // Login Button

                    // Register Button

                }
            }
        }
    }
}