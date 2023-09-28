fun main() {
    val motorCombustao = MotorCombustao()
    val fuca = Carro(motorCombustao)
    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)

    fuca.ligar()
    fuca.anda()

    tesla.ligar()
    tesla.anda()


}

