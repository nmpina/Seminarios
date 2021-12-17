package pt.ipg.seminarios

data class Seminario (var titulo: String, var sumario: String, var _idOrador: Long, var nomeOrador: String, var id: Long = -1) {}