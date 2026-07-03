// gas sum
class Program9 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totTank=0,carTank=0,ista=0;
        for(int index=0;index<gas.length;index++){
            totTank+=gas[index]-cost[index];
            carTank+=gas[index]-cost[index];
            if(carTank<0){
                carTank=0;
                ista=index+1;
            }
        }
        return totTank>=0?ista:-1;
     }
}