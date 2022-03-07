package list1.exe2;

public class Lampada {

int qtdClick;
boolean state;

public void clickInterruptor()
{
if(this.qtdClick<10)
{
this.qtdClick++;
changeState();
}

else {
this.state=false;
}
}

void changeState()
{
if(this.state == true)
{
this.state=false;
}

else {
this.state=true ;
}
}

boolean getState()
{
return this.state;
}
}