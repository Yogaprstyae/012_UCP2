package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.exercise2.data.OrderUIState

@Composable
fun HalamanDua(
    orderUIState: OrderUIState,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair(stringResource(R.string.dosen), orderUIState.form),
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier =
            Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement =
            Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Spacer(modifier = Modifier.padding(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text(stringResource(id = R.string.nama))
                        Text(text = orderUIState.nama)
                    }
                    Divider()
                    Spacer(modifier = Modifier.padding(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text(stringResource(id = R.string.nim))
                        Text(text = orderUIState.nim)
                    }
                    Divider()
                    Spacer(modifier = Modifier.padding(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text(stringResource(id = R.string.konsentrasi))
                        Text(text = orderUIState.konsentrasi)
                    }
                    Divider()
                    Spacer(modifier = Modifier.padding(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text(stringResource(id = R.string.judul))
                        Text(text = orderUIState.judul)
                    }
                    Divider()
                    Spacer(modifier = Modifier.padding(12.dp))
                }
                Row(
                    modifier = Modifier
                        .weight(1f, false)
                        .padding(dimensionResource(R.dimen.padding_medium))
                ) {
                    Column(
                        verticalArrangement =
                        Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
                    ) {
                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            onClick = onBackButtonClicked
                        ) {
                            Text(stringResource(R.string.btn_back))
                        }
                    }
                }
            }
        }
    }
}