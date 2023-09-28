package ca.tetervak.stackdemo.ui.stack

import androidx.lifecycle.ViewModel
import ca.tetervak.stackdemo.data.StackDemo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class StackViewModel: ViewModel() {

    private val _uiState: MutableStateFlow<StackUiState> =
        MutableStateFlow(StackUiState())
    val uiState: StateFlow<StackUiState> = _uiState

    private val stack = StackDemo()

    fun pop() {
        stack.pop()
        _uiState.update {
            StackUiState(items = stack.items)
        }
    }

    fun push(value: String){
        stack.push(value)
        _uiState.update {
            StackUiState(items = stack.items)
        }
    }
}