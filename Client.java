public class Client {
private int numeroClient;
public Client(int numeroClient)
{
	this.numeroClient=numeroClient
}
public String getNumero()
{
	return this.numeroClient;
}
public setNumero(int numeroClient)
{
	this.numeroClient=numeroClient;
}
public String toString()
{
      return "Client : "+this.numeroClient;
}
