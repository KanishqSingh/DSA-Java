public class CircularTour {

    public static int findStartStation(int[] petrol, int[] distance) {
        int totgas = 0, totcost = 0,netgas = 0,currentGas=0,start=0;
        for (int val : petrol) {
            totgas += val;
        }
        for (int val : distance) {
            totcost += val;
        }

        if(totgas < totcost){
            return -1;
        }

        for (int i = 0; i < petrol.length; i++) {
            netgas = petrol[i] - distance[i];
            totgas += netgas;
            currentGas += netgas;
            if(currentGas < 0 ){
                start = i+1;
                currentGas = 0;
            }
            
        }
        return (totgas>=0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = { 4, 6, 7, 4 };
        int[] distance = { 6, 5, 3, 5 };

        int startIndex = findStartStation(petrol, distance);

        if (startIndex != -1)
            System.out.println("Start at petrol pump index: " + startIndex);
        else
            System.out.println("No feasible tour possible");
    }
}
