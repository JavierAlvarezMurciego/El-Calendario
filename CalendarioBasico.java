public class CalendarioBasico
{
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico(){
        dia = 1;
        mes = 1;
        ano = 1;
    }

    public String obtenerFecha(){
        String fecha = "";
        String diaMostrar = "";
        String anoMostrar = "";
        String mesMostrar = "";
        if (dia < 10){
            diaMostrar = "0"+dia;
        } 
        else{
            diaMostrar = ""+dia;

        }
        if (ano < 10){
            anoMostrar = "0"+ano;
        }
        else{
            anoMostrar = ""+ano;

        }
        if (mes < 10){
            mesMostrar = "0"+mes;
        }
        else{
            mesMostrar = ""+mes;

        }
        fecha = diaMostrar+"-"+mesMostrar+"-"+anoMostrar;
        return fecha;
    }

    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }

    public void avanzarFecha(){
        if(dia == 30){
            dia = 1;
            if(mes == 12){
                mes = 1;
                if(ano == 99){
                    ano = 1;
                }
                else{
                    ano = ano + 1;
                }
            }
            else{
                mes = mes + 1;
            }   
        }
        else{
            dia = dia + 1;
        }
    }
}

