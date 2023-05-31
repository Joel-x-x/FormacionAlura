    var pantalla = document.querySelector('canvas');
    var pincel = pantalla.getContext('2d');

    pincel.fillStyle = 'grey';
    pincel.fillRect(0, 0, 600, 400);

    var puedoDibujar = false;
    let contador = 0

    function dibujarCirculo(evento) {
      restringirPaleta(evento)

      if (puedoDibujar) {
        let colores = ['blue','red','yellowgreen']
        var x = evento.pageX - pantalla.offsetLeft;
        var y = evento.pageY - pantalla.offsetTop;
        console.log(colores[contador])
        pincel.fillStyle = colores[contador]
        pincel.beginPath();
        pincel.arc(x, y, 5, 0, 2 * 3.14);
        pincel.fill();
      }

    }

    function dibujarPaleta() {
      pincel.fillStyle = "red"
      pincel.fillRect(0, 0, 50, 50)
      pincel.fillStyle = "yellowgreen"
      pincel.fillRect(50, 0, 50, 50)
      pincel.fillStyle = "blue"
      pincel.fillRect(100, 0, 50, 50)
    }

    function restringirPaleta(e) {
      let x = e.pageX
      let y = e.pageY

      if (x >= 0 && x <= 155 && y >= 0 && y <= 55) {
        deshabilitarDibujar()
      }
    }

    dibujarPaleta()

    pantalla.onmousemove = dibujarCirculo;

    function habilitarDibujar(e) {
      let x = e.pageX
      let y = e.pageY

      if(x >= 0 && x < 50 && y >= 0 && y <= 50) {
        contador = 1
      } 
      else if(x > 50 && x <= 100 && y >= 0 && y <= 50) {
        contador = 2
      } 
      else if(x > 100 && x <= 150 && y >= 0 && y <= 50) {
        contador = 0
      }
      puedoDibujar = true;
    }

    function deshabilitarDibujar() {

      puedoDibujar = false;
    }

    pantalla.onmousedown = habilitarDibujar;

    pantalla.onmouseup = deshabilitarDibujar;