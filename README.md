Simulación de Persecución

Este proyecto es una simulación simple de un juego de persecución en consola. El jugador controla un personaje (Jugador) que se mueve utilizando las teclas W, A, S y D, mientras trata de evitar ser atrapado por tres enemigos (Enemigo). El juego finaliza cuando el jugador es capturado, y se muestra la cantidad de pasos dados sin ser atrapado.

Clases

Coordinates2D
La clase Coordinates2D representa un punto en el plano 2D con coordenadas X e Y. Proporciona métodos para obtener y modificar estas coordenadas, así como para calcular la distancia entre dos puntos.

Enemigo

La clase Enemigo extiende Coordinates2D e implementa ListChangeListener<Coordinates2D>. Los enemigos se mueven automáticamente hacia la posición del jugador cada vez que este se mueve. La implementación del método onChanged permite que los enemigos reaccionen a los movimientos del jugador.

Jugador

La clase Jugador extiende Coordinates2D y simplemente representa la posición del jugador en el plano 2D.

Juego

La clase principal Juego contiene la lógica del juego. Crea un jugador y tres enemigos, luego permite al jugador moverse utilizando las teclas especificadas. La distancia entre el jugador y los enemigos se verifica en cada iteración del bucle principal, y se muestra la cantidad de pasos dados sin ser atrapado al finalizar el juego.

Uso

Ejecuta la aplicación y sigue las instrucciones en consola para mover al jugador. El juego finaliza cuando el jugador es capturado, y se muestra la cantidad de pasos dados sin ser atrapado.