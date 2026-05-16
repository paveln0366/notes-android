package com.dvoraksoft.notes.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dvoraksoft.notes.presentation.screens.creation.CreateNoteScreen
import com.dvoraksoft.notes.presentation.ui.theme.NotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesTheme {
                CreateNoteScreen(
                    onFinished = {
                        Log.d("CreateNoteScreen", "Finished")
                    }
                )
//                NotesScreen(
//                    onNoteClick = {
//                        Log.d("MainActivity", "onNoteClick: $it")
//                    },
//                    onAddNoteClick = {
//                        Log.d("MainActivity", "onAddNoteClick")
//                    }
//                )
            }
        }
    }
}