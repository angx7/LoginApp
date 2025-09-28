package com.example.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapp.R
import com.example.loginapp.components.CustomButton
import com.example.loginapp.components.TextFieldOculto
import com.example.loginapp.components.TextFieldPerso

@Composable
fun RegisterScreen(navController: NavController, innePadding: PaddingValues) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    var confirmPasswordVisibility by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background
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

            Card(
                modifier = Modifier
                    .weight(0.4f)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                shape = RoundedCornerShape(0.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier
                            .size(48.dp)
                            .align(Alignment.CenterStart)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Volver",
                            tint = Color.White
                        )
                    }
                    Text(
                        text = stringResource(R.string.sign_up),
                        fontSize = 40.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Card(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 0.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 38.dp, vertical = 38.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        // First Name
                        TextFieldPerso(
                            text = stringResource(R.string.first_name),
                            value = firstName,
                            onValueChange = { firstName = it },
                            placeholder = stringResource(R.string.first_name_placeholder)
                        )

                        // Last Name
                        TextFieldPerso(
                            text = stringResource(R.string.last_name),
                            value = lastName,
                            onValueChange = { lastName = it },
                            placeholder = stringResource(R.string.last_name_placeholder)
                        )

                        // Email
                        TextFieldPerso(
                            text = stringResource(R.string.label_email),
                            value = email,
                            onValueChange = { email = it },
                            placeholder = stringResource(R.string.placeholder_email)
                        )

                        // Password
                        TextFieldOculto(
                            text = stringResource(R.string.label_password),
                            value = password,
                            onValueChange = { password = it },
                            showPassword = passwordVisibility,
                            placeholder = stringResource(R.string.placeholder_password),
                            onShowPasswordChange = { passwordVisibility = !passwordVisibility }
                        )

                        // Confirm Password
                        TextFieldOculto(
                            text = stringResource(R.string.confirm_password),
                            value = confirmPassword,
                            onValueChange = { confirmPassword = it },
                            showPassword = confirmPasswordVisibility,
                            placeholder = stringResource(R.string.placeholder_password),
                            onShowPasswordChange = { confirmPasswordVisibility = !confirmPasswordVisibility }
                        )

                        // Botón
                        CustomButton(stringResource(R.string.sign_up))

                    }

                    // Link fijo al fondo del Card
                    Text(
                        text = stringResource(R.string.have_account),
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .clickable { navController.popBackStack() }
                    )
                }
            }
        }
    }
}
