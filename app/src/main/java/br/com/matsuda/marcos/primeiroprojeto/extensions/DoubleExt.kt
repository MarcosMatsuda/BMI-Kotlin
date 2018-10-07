package br.com.matsuda.marcos.primeiroprojeto.extensions

fun Double.format(digitos: Int) = String.format("%.${digitos}f", this)