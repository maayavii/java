public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public static class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Processor: Cores - " + cores + ", Manufacturer - " + manufacturer;
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "RAM: Memory - " + memory + "GB, Manufacturer - " + manufacturer;
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(200); // assuming price is $200
        Processor processorInfo = new Processor(4, "Intel");
        RAM ramInfo = new RAM(8, "Corsair");

        // Print information of Processor and RAM
        System.out.println("CPU Price: $" + cpu.price);
        System.out.println(processorInfo);
        System.out.println(ramInfo);
        
        System.out.println("amal manoj");
        System.out.println(" 21/02/2024");
    }
}
