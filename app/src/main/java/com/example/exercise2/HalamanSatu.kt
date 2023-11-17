package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exercise2.ui.theme.Exercise2Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
){
    var nama by rememberSaveable { mutableStateOf("") }
    var nim by rememberSaveable { mutableStateOf("") }
    var konsen by rememberSaveable { mutableStateOf("") }
    var judul by rememberSaveable { mutableStateOf("") }
    var listData : MutableList<String> = mutableListOf(nama,nim,konsen,judul)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Formulir Pengajuan Skripsi")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nama,
            onValueChange = {nama = it},
            label = { Text(text = "Nama Mahasiswa") })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = nim,
            onValueChange = {nim = it},
            label = { Text(text = "NIM") })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = konsen,
            onValueChange = {konsen = it},
            label = { Text(text = "Konsentrasi") })
        OutlinedTextField(
            value = judul,
            onValueChange = {judul = it},
            label = { Text(text = "Judul Skripsi") })
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = { onSubmitButtonClicked(listData) }, enabled = nama.isNotEmpty()) {
                Text(stringResource(id = R.string.btn_submit))
            }
        }
    }
}

@Preview
@Composable
fun PreviewHalamanHome() {
    Exercise2Theme {
        HalamanSatu (onSubmitButtonClicked = {})
    }
}