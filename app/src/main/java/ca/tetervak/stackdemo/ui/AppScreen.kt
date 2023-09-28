package ca.tetervak.stackdemo.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import ca.tetervak.stackdemo.ui.stack.StackScreen
import ca.tetervak.stackdemo.ui.stack.StackViewModel

@Composable
fun AppScreen() {
    val viewModel: StackViewModel = viewModel()
    StackScreen(viewModel)
}