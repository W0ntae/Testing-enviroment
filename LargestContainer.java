class LargestContainer {
  public int maxArea(int[] height) {
      int maxContainer = 0, head = 0, tail = height.length -1;
      int left = height[head], right = height[tail];
      while (left > right){
        int leng = tail - head;
        int area = leng * right;
        tail--;
        if (maxContainer < area){
          maxContainer = area;
        }
      }
      while (right > left){
        int leng = tail - head;
        int area = leng * left;
        head++;
        if (maxContainer < area){
          maxContainer = area;
        }
      }
      return maxContainer;
  }
}