
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        solve(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    void solve(int[][] image, int sr, int sc, int color, int oldColor) {
        if (sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0 || image[sr][sc] != oldColor)
            return;
        image[sr][sc] = color;
        solve(image, sr - 1, sc, color, oldColor);
        solve(image, sr + 1, sc, color, oldColor);
        solve(image, sr, sc - 1, color, oldColor);
        solve(image, sr, sc + 1, color, oldColor);
    }

}