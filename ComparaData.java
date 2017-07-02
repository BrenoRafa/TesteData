import java.sql.Date;


public class ComparaData {

	public boolean CompararData(Date dataEmissao, Date dataHoje) {
		
		int aux;
		aux = dataHoje.getDate() - dataEmissao.getDate();
		
		if(aux <= 0)
			return true;//vencida
		else
			return false;//liberada
					
		
		/*
		 *dataEmissao.setYear(dataEmissao.getYear()+ 5); 
		 *
		 *if(dataHoje.getDate() > dataEmissao.getDate())
		 *	return true; // vencida
		 *else
		 *	return false;// liberada
		*/
		
	}
}



//se 2017 = 2011+5 Imprime: CNH Vencida
//se 2017 = 2012+5 Imprime: CNH Vencida
//se 2017 = 2015+5 Imprime: CNH Liberada