package eu.tutorials.volyprofilepage


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import eu.tutorials.volyprofilepage.ui.theme.VolyProfilePageTheme
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ProfilePage() {
    Card(
        elevation = 6.dp ,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp , bottom = 100.dp , start = 16.dp , end = 16.dp)
            .border(width = 2.dp , color = Color.White , shape = RoundedCornerShape(30.dp))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally ,
            modifier = Modifier.fillMaxSize() // centre align the voly logo using the whole width of screen
        ) {
            Image(
                painter = painterResource(id = R.drawable.voly) ,
                contentDescription = "Voly" ,
                modifier = Modifier          //Modify the image to add attributes size, shape, red bord around it
                    .size(150.dp)            // import dp and modifier
                    .clip(CircleShape)       // place the image within the shape with 150dp
                    .border(                 // red circle - import border
                        width = 2.dp ,
                        color = Color.Red ,
                        shape = CircleShape
                    )
            )


            Text(text = "Welcome To Voly")
            Text(text = "Sydney, Australia")

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(17.dp)
            )
            {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "678" , fontWeight = FontWeight.Bold)
                    Text(text = "Followers")
                }
                Row {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "550" , fontWeight = FontWeight.Bold)
                        Text(text = "Following")
                    }
                    Row() {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "678" , fontWeight = FontWeight.Bold)
                            Text(text = "Posts")


                        }


                    }


                }

                @Preview(showBackground = true)
// Android studio allows us to see how the composable would look like show background = true gives a white background
                @Composable
                fun PreviewProfilePage() {
                    VolyProfilePageTheme() {

                    }
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly , // evenly space out the row to take up the width of the screen
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Follow us")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Message Us")
                }
            }


        }

    }
}


//Problems encountered
//1.Importing tools-  each file may contain its own import directives. eg I needed to to import files to use painter function
// 2. Syntax errors - commas, brackets
//3. Expecting an expression - you tried to use a statement where Kotlin wanted an expression.
//4. objects and struct cannot be referenced the same
//classes must have different arguements / parameters