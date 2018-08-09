package models;

public class Doctor {
String name;
String id;
String spec;
String avail;
long numberofpatients;

public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public String getId()
{
	return id;
}
public void setId(String id)
{
	this.id=id;
}
public String getSpec()
{
	return spec;
}
public void setSpec(String spec)
{
	this.spec=spec;
}
public long getNoofPatients()
{
	return numberofpatients;
}
public void setNoofPatients(long numberofpatients)
{
	this.numberofpatients=numberofpatients;
}
}
