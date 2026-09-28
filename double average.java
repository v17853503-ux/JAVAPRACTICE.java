static double average(int[] marks) {
    int total = 0;
    // Fixed: changed <= to <
    for (int i = 0; i < marks.length; i++) { 
        total += marks[i];
    }
    // Fixed: cast total to double to prevent integer division
    return (double) total / marks.length; 
}
