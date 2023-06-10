public class WorldPopulationGrowth {
    
    
    public static void main(String[] args) {
        

        double currentPopulation = 7.8; // população atual em bilhoõees
        double growthRate = 1.05 / 100; // taxa de crescimento anual

        
        System.out.println("Ano\tPopulação Estimada (em bilhões)");
        for (int year = 1; year <= 5; year++) {
            currentPopulation += currentPopulation * growthRate;
            System.out.printf("%d\t%.2f%n", year, currentPopulation);
        }
    }
}
