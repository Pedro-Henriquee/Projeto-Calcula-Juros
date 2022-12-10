package exercícios;

import java.util.*; import java.text.*;
public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#####0.00");
		String continua = "S";
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite o valor da dívida:");
			double divida = s.nextDouble();
			System.out.println("Digite a quantidade de parcelas dentre as opções: 1 - 3 - 6 - 9 - 12");
			int parcelaTipo = s.nextInt();
			double valorJuros = 0;
			double valorParcela = 0;
			double valorDevedor = 0;
			
			if (parcelaTipo == 1) {
				valorJuros = (divida * 0)/100;
				valorParcela = divida/parcelaTipo;
				valorDevedor = divida + valorJuros;
				System.out.println("VALOR DA DÍVIDA | VALOR DOS JUROS | QUANTIDADE DE PARCELAS | VALOR DA PARCELA | SALDO DEVEDOR");
				System.out.println(df.format(divida) + "         |        " + df.format(valorJuros) + "     |    " + parcelaTipo 
						+ "                   |         " + df.format(valorParcela) + "  |   " + df.format(valorDevedor));
				System.out.println("Deseja continuar? S/N");
				continua = s.next();
			}
			else {
				if (parcelaTipo == 3) {
					valorJuros = (divida * 10)/100;
					valorParcela = divida/parcelaTipo;
					valorDevedor = divida + valorJuros;
					System.out.println("VALOR DA DÍVIDA | VALOR DOS JUROS | QUANTIDADE DE PARCELAS | VALOR DA PARCELA | SALDO DEVEDOR");
					System.out.println(df.format(divida) + "         |        " + df.format(valorJuros) + "     |    " + parcelaTipo 
							+ "                 |         " + df.format(valorParcela) + "   |   " + df.format(valorDevedor));
					System.out.println("Deseja continuar? S/N");
					continua = s.next();
				}
				else {
					if (parcelaTipo == 6) {
						valorJuros = (divida * 15) /100;
						valorParcela = divida/parcelaTipo;
						valorDevedor = divida + valorJuros;
						System.out.println("VALOR DA DÍVIDA | VALOR DOS JUROS | QUANTIDADE DE PARCELAS | VALOR DA PARCELA | SALDO DEVEDOR");
						System.out.println(df.format(divida) + "         |        " + df.format(valorJuros) + "     |    " + parcelaTipo 
								+ "                   |         " + df.format(valorParcela) + "  |   " + df.format(valorDevedor));
						System.out.println("Deseja continuar? S/N");
						continua = s.next();
					}
					else {
						if (parcelaTipo == 9) {
							valorJuros = (divida * 20)/100;
							valorParcela = divida/parcelaTipo;
							valorDevedor = divida + valorJuros;
							System.out.println("VALOR DA DÍVIDA | VALOR DOS JUROS | QUANTIDADE DE PARCELAS | VALOR DA PARCELA | SALDO DEVEDOR");
							System.out.println(df.format(divida) + "         |        " + df.format(valorJuros) + "     |    " + parcelaTipo 
									+ "                   |         " + df.format(valorParcela) + "  |   " + df.format(valorDevedor));
							System.out.println("Deseja continuar? S/N");
							continua = s.next();
						}
						else {
							if (parcelaTipo == 12) {
								valorJuros = (divida * 25)/100;
								valorParcela = divida/parcelaTipo;
								valorDevedor = divida + valorJuros;
								System.out.println("VALOR DA DÍVIDA | VALOR DOS JUROS | QUANTIDADE DE PARCELAS | VALOR DA PARCELA | SALDO DEVEDOR");
								System.out.println(df.format(divida) + "         |        " + df.format(valorJuros) + "     |    " + parcelaTipo 
										+ "                   |         " + df.format(valorParcela) + "  |   " + df.format(valorDevedor));
								System.out.println("Deseja continuar? S/N");
								continua = s.next();
							}
							else {
								System.out.println("Não foi possível encontrar a quantidade de parcelas!");
								System.out.println("Deseja continuar? S/N");
								continua = s.next();
							}
						}
					}
				}
			}
		}
	}
}

