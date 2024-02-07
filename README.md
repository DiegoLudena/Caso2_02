CASO PRÁCTICO 1
Batalla Espacial Multihilo
Contexto
En un lejano rincón del universo, dos civilizaciones alienígenas, los Zorgs y los Blips, están
enfrascadas en una feroz batalla espacial por el control de la galaxia. Cada civilización
envía su flota de naves estelares representadas por hilos (Thread), y tu tarea es
implementar un programa en Java utilizando la interfaz Runnable y gestionar la
concurrencia mediante el uso de synchronized.
Cuestiones a resolver
Crea una clase principal llamada BatallaEspacial que contendrá el hilo principal (main) y
será responsable de iniciar la batalla.
Define una clase llamada NaveEstelar que implemente la interfaz Runnable. Cada
instancia de esta clase representará una nave estelar perteneciente a una de las
civilizaciones.
Las naves estelares deben moverse hacia adelante en el espacio de manera sincronizada.
Utiliza bloques synchronized para garantizar la consistencia en la posición de las naves.
Cada nave estelar debe imprimir su posición en la batalla en cada paso.
La batalla debe tener un límite de tiempo (por ejemplo, 200 pasos), y al final del tiempo,
la civilización con más naves cerca del centro de la galaxia será declarada ganadora.
Garantiza que no haya condiciones de carrera ni problemas de concurrencia. Utiliza
synchronized de manera adecuada para evitar conflictos.
¡Que la fuerza esté contigo en la Batalla Espacial Multihilo! 🚀🛸
