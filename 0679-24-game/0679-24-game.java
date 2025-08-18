class Solution {
    public boolean judgePoint24(int[] cards) {
       List<Double> list = new ArrayList<>();
        for(double c: cards){
            list.add(c);
        }

        return solve(list);
    }

    public boolean solve(List<Double> list)
    {

        if(list.size() == 1){
            return Math.abs(list.get(0) - 24) < 1e-6;
        } 
        // else if(list.size() == 1){
        //     return false;
        // }
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){

                double x = list.get(i);
                double y = list.get(j);

                for(double a: compute(x, y)){
                    list.remove(j);
                    list.remove(i);
                    list.add(0, a);

                    if(solve(list))
                    {
                        return true;
                    }

                    list.remove(0);
                    list.add(i, x);
                    list.add(j, y);
                }
            }

    }
    return false;
}

public List<Double> compute(double x, double y){
    List<Double> abc = new ArrayList<>();
    abc.add(x+y);
    abc.add(x*y);
    abc.add(x-y);
    abc.add(y-x);
    abc.add(x/y);
    abc.add(y/x);

    return abc;
}
}