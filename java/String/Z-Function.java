Este algoritmo encuentra todas las apariciones de un patrón en un texto en tiempo lineal.
Sea la longitud del texto n y del patrón m, entonces el tiempo total tomado es O (m + n) con complejidad de espacio lineal.

static int[] zf(String ss) {
    StringBuilder s = new StringBuilder(ss);
    int n = s.length();
    int[] z = new int[n];
    int x = 0, y = 0;
    for (int i = 1; i < n; i++) {
        z[i] = Math.max(0, Math.min(z[i - x], y - i + 1));
        while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
            x = i;
            y = i + z[i];
            z[i]++;
        }
    }
    return z;
}
