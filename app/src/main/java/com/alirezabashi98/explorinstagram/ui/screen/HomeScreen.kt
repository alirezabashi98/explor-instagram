package com.alirezabashi98.explorinstagram.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    PreViewHomeScreen()
}

@Preview
@Composable
private fun PreViewHomeScreen() {
    val constrainSet = ConstraintSet {

        val box1 = createRefFor("box1")
        val box2 = createRefFor("box2")
        val box3 = createRefFor("box3")

        val box4 = createRefFor("box4")
        val box5 = createRefFor("box5")
        val box6 = createRefFor("box6")

        val box7 = createRefFor("box7")
        val box8 = createRefFor("box8")
        val box9 = createRefFor("box9")

        val box10 = createRefFor("box10")
        val box11 = createRefFor("box11")
        val box12 = createRefFor("box12")

        val box13 = createRefFor("box13")
        val box14 = createRefFor("box14")
        val box15 = createRefFor("box15")

        val box16 = createRefFor("box16")
        val box17 = createRefFor("box17")
        val box18 = createRefFor("box18")

        constrain(box1) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(box4.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box2) {
            top.linkTo(box1.bottom)
            start.linkTo(parent.start)
            end.linkTo(box1.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box3) {
            top.linkTo(parent.top)
            start.linkTo(box1.end)
            end.linkTo(parent.end)
            bottom.linkTo(box4.top)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }

        constrain(box4) {
            top.linkTo(box2.bottom)
            start.linkTo(parent.start)
            end.linkTo(box5.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box5) {
            top.linkTo(box4.top)
            start.linkTo(box4.end)
            end.linkTo(box6.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box6) {
            top.linkTo(box4.top)
            start.linkTo(box5.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }

        constrain(box7) {
            top.linkTo(box4.bottom)
            start.linkTo(parent.start)
            end.linkTo(box8.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box8) {
            top.linkTo(box7.top)
            start.linkTo(box7.end)
            end.linkTo(box9.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box9) {
            top.linkTo(box7.top)
            start.linkTo(box8.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }

        constrain(box10) {
            top.linkTo(box9.bottom)
            start.linkTo(box15.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box11) {
            top.linkTo(box10.bottom)
            start.linkTo(box10.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box12) {
            top.linkTo(box10.top)
            start.linkTo(parent.start)
            end.linkTo(box10.start)
            bottom.linkTo(box13.top)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }

        constrain(box13) {
            top.linkTo(box11.bottom)
            start.linkTo(parent.start)
            end.linkTo(box14.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box14) {
            top.linkTo(box13.top)
            start.linkTo(box13.end)
            end.linkTo(box15.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box15) {
            top.linkTo(box13.top)
            start.linkTo(box14.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }

        constrain(box16) {
            top.linkTo(box15.bottom)
            start.linkTo(parent.start)
            end.linkTo(box17.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box17) {
            top.linkTo(box16.top)
            start.linkTo(box16.end)
            end.linkTo(box18.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }
        constrain(box18) {
            top.linkTo(box16.top)
            start.linkTo(box17.end)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(100.dp)
        }

        createHorizontalChain(box4, box5, box6)
        createHorizontalChain(box7, box8, box9)
        createHorizontalChain(box13, box14, box15)
        createHorizontalChain(box16, box17, box18)
    }

    val scrollState = rememberScrollState()

    ConstraintLayout(
        constraintSet = constrainSet, modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                scrollState
            )
    ) {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .layoutId("box1")
        )
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .layoutId("box2")
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .layoutId("box3")
        )
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .layoutId("box4")
        )
        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                .layoutId("box5")
        )
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .layoutId("box6")
        )
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .layoutId("box7")
        )
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .layoutId("box8")
        )
        Box(
            modifier = Modifier
                .background(Color.Red)
                .layoutId("box9")
        )
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .layoutId("box10")
        )
        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                .layoutId("box11")
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .layoutId("box12")
        )
        Box(
            modifier = Modifier
                .background(Color.Black)
                .layoutId("box13")
        )
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .layoutId("box14")
        )
        Box(
            modifier = Modifier
                .background(Color.Red)
                .layoutId("box15")
        )
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .layoutId("box16")
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .layoutId("box17")
        )
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .layoutId("box18")
        )
    }
}