fun main() {
    var nome: String = "Stefano";
    var eta: Int = 28;
    val nomi: Collection<String> = mutableListOf(nome, "Giorgio");
    val cognomi: MutableCollection<String> = ArrayList();
    val ids: MutableSet<Int> = HashSet<Int>()

    val numbers: MutableList<Int> = ArrayList();
    val iterazioni = 20000000;
    val quadratica = 1000;
    val numero = -1;

    var startTime = System.currentTimeMillis();

    for (i in 1..iterazioni) {
        numbers.add(i);
    }
    var endTime = System.currentTimeMillis();

    println("Tempo per aggiungere alla lista: ${endTime - startTime}");

    numbers.shuffle();
    startTime = System.currentTimeMillis();
    println("La lista contiene $numero ? ${numbers.contains(numero)}");
    endTime = System.currentTimeMillis();

    println("Tempo per cercare nella lista: ${endTime - startTime}");

    startTime = System.currentTimeMillis();
    println("Ricerca quadratica su $quadratica elementi nella lista, quanto tempo?");
        for(i in 1..quadratica) {
            numbers.contains(i);
        }
    endTime = System.currentTimeMillis();

    println("Tempo per cercare nella lista quadratica: ${endTime - startTime}");
    numbers.clear()

    startTime = System.currentTimeMillis();
    for (i in 1..iterazioni) {
        ids.add(i);
    }
    endTime = System.currentTimeMillis();

    println("Tempo per aggiungere al SET: ${endTime - startTime}");

    startTime = System.currentTimeMillis();
    println("Il set contiene $numero ? ${ids.contains(numero)}");
    endTime = System.currentTimeMillis();

    println("Tempo per cercare nel set: ${endTime - startTime}");

    startTime = System.currentTimeMillis();
    println("Ricerca quadratica su $quadratica elementi nel set, quanto tempo?");
    for(i in 1..quadratica) {
        ids.contains(i);
    }
    endTime = System.currentTimeMillis();

    println("Tempo per cercare nel set quadratica: ${endTime - startTime}");

}