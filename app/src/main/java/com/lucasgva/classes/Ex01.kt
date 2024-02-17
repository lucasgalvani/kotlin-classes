package com.lucasgva.classes
/*
Crie uma classe veículo que tenha as seguintes propriedades e métodos:
• Propriedades:
    - Velocity: Valor inicial 0;
    - Acceleration: Valor inicial 10;
    - Model: Do tipo String
• Métodos:
    - Crie um método para incrementar a velocidade do carro que calcule a nova velocidade, somando o
    valor da propriedade acceleration ao da velocity, salvando o resultado em velocity;
    - Crie um método para reduzir a velocidade do carro que calcule a nova velocidade, decrementando
    o valor da propriedade acceleration ao da velocity, salvando o resultado em velocity.
    Obs: O valor da velocidade nunca pode ser negativo.
    - Crie um método que retorna a velocidade atual do veículo
 */

fun main() {
    val carro = Veiculo("Ford")

    println("Velocidade Inicial: ${carro.obterVelocidadeAtual()}")

    carro.incrementarVelocidade()
    println("Velocidade após aceleração: ${carro.obterVelocidadeAtual()}")

    carro.reduzirVelocidade()
    println("Velocidade após redução: ${carro.obterVelocidadeAtual()}")
}

class Veiculo(var model: String) {
    private var velocity: Int = 0
    var acceleration: Int = 10

    fun incrementarVelocidade() {
        velocity += acceleration
    }

    fun reduzirVelocidade() {
        velocity = maxOf(0, velocity - acceleration)
    }

    fun obterVelocidadeAtual(): Int {
        return velocity
    }
}
