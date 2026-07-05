class Program14 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rSize = matrix.length;
        int cSize = matrix[0].length;

        int start = 0;
        int end = rSize * cSize - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = mid / cSize;
            int col = mid % cSize;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
    

