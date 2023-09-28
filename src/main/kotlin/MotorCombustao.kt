class MotorCombustao : Motor(){

    private var nivelDeCombustivel = 2


    override fun autonomia(): Boolean {
        return nivelDeCombustivel > 0
    }

    override fun gastando() {
        if(nivelDeCombustivel > 0) {
            println(
                "Gastando combustivel! " +
                        "Combustivel: $nivelDeCombustivel ustivel"
            )
            nivelDeCombustivel--
        }else{println("Gazolina acabou!")}
    }

}