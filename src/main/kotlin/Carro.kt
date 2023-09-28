class Carro(private val motor: Motor) {

    fun ligar() {
        println("Ligando o carro...")
        motor.ligarMotor()
    }

    fun desligar() {
        println("Desligando o Carro...")
        motor.desligar()
    }


    fun anda() {
        when {
            !motor.estaLigado() -> println("Liga o carro primeiro!")
            !motor.autonomia() -> {
                when(motor){
                    is MotorEletrico -> println("Tem que carregar a bateria!")
                    is MotorCombustao -> println("Tem que por gasolina!!!")
                }
                motor.desligar()
            }
            else -> {
                motor.gastando()
                println("Carro andando...")
            }
        }
    }
    fun frea() {
        println("freando o carro")
    }

    fun busina() {
        println("BIBI")
    }


}