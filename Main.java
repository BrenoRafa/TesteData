import java.sql.Date;

import javax.swing.JOptionPane;


public class Main {
	
	public static void main(String[] args) {
	
		
		/* TESTE CONVERTE DATA
		String dataCalendar;
		ConverteDataEUA_BR converteDataEUA_BR = new ConverteDataEUA_BR();
		
		dataCalendar = JOptionPane.showInputDialog("Informe a data no Padrao Brasileiro DD/MM/AAAA");
		 
		JOptionPane.showMessageDialog(null, "Data Convertida para o Padrão EUA AAAA/MM/DD: " + converteDataEUA_BR.ConverteData(dataCalendar));
		*/
		
		ComparaData comparaData = new ComparaData();
		Date dataEmissao, dataHoje;
		String auxE, auxH, aux;
		int opcao = 0, auxdate;
				

		
		do{
		
		auxE = JOptionPane.showInputDialog("Informe a data de Emissao");
		auxH = JOptionPane.showInputDialog("Informe a data de Hoje");
		
		dataHoje = Date.valueOf(auxH);
		dataEmissao = Date.valueOf(auxE);
				
		if(comparaData.CompararData(dataEmissao, dataHoje))
			JOptionPane.showMessageDialog(null, "CNH Vencida!");
		else 
			JOptionPane.showMessageDialog(null, "CNH Liberada");
		
		aux = JOptionPane.showInputDialog("MENU\n"
				+ "\n1 - Verificar CNH"
				+ "\n2 - Sair");
		opcao = Integer.parseInt(aux);
		
		}while(opcao == 1);
		
	}
	
}	
