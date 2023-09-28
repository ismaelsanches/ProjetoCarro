abstract class Motor {

    private var ligado: Boolean = false

    fun ligarMotor() {
        ligado = true
    }

    fun desligar() {
        println("Desligando motor...")
        ligado = false
    }

    fun estaLigado(): Boolean {
        return ligado
    }
    abstract fun autonomia(): Boolean
    abstract fun gastando()
}