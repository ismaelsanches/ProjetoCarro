class MotorEletrico : Motor() {

    private var nivelBateria = 2

    override fun autonomia(): Boolean {
        return nivelBateria > 0
    }

    override fun gastando() {
        if(nivelBateria > 0) {
            println(
                "Gastando energia! " +
                        "Bateria: $nivelBateria"
            )
            nivelBateria--
        }else{println("Bateria acabou!")}
    }

}