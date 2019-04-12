<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/main.css"></link>
        <title>Caballos</title>
    </head>
    <body>
        <!-- div contenedor de toda la aplicacion -->
        <div id="app">
            <div class="canvas-container">
                ${error}
                <!-- Aqui va el canvas -->
                
                <br></br>
                <h1> Apuestas: </h1>
                <p>
                    ${jugadores[0].getNombre()} => ${jugadores[0].getSaldo()}
                </p>
                <br></br>
                <p>
                    ${jugadores[1].getNombre()} => ${jugadores[1].getSaldo()}
                </p>
                <br></br>
                <p>
                    ${jugadores[2].getNombre()}  => ${jugadores[2].getSaldo()}
                </p>
                <br></br>
                <p>
                    ${jugadores[3].getNombre()} => ${jugadores[3].getSaldo()}
                </p>
                <br></br>
            </div>
            <form id="menu" action="./Inicio" method="POST">
                <div class="row">
                    <input id="boton-apostar" type="submit" value="Apostar" /></input>
                    <div class="info-jugador block" style="background: chocolate; color: white">
                        <img src="player1.png" alt="">
                        <p>Dinero jugador 1: ${{dinero}}</p>
                        <input required type="number" placeholder="apuesta" name="apuesta-jugador1" type=""> </input>
                    </div>
                    <div class="info-jugador block" style="background: grey; color: white">
                            <img src="player2.png" alt="">
                        <p>Dinero jugador 2: ${{dinero}}</p>
                        <input required type="number" placeholder="apuesta" name="apuesta-jugador2" type=""> </input>
                    </div>
                    <div class="info-jugador block" style="background: black; color: white">
                            <img src="player3.png">
                        <p>Dinero jugador 3: ${{dinero}}</p>
                        <input required type="number" placeholder="apuesta" name="apuesta-jugador3" type=""> </input>
                    </div>
                    <div class="info-jugador block" style="background: tomato; color: white">
                            <img src="player4.png">
                        <p>Dinero jugador 4: ${{dinero}}</p>
                        <input required type="number" placeholder="apuesta" name="apuesta-jugador4" type=""> </input>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
