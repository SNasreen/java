
bool check(string s, int m)
{
    // length of binary string
    int l = s.length();
 
    // counts zeros
    int c1 = 0;
 
    // counts 1's
    int c2 = 0;
 
    for (int i = 0; i < l; i++) {
 
        if (s[i] == '0') {
            c2 = 0;
            
           // count consecutive 0's
            c1++;
        }
        else {
            c1 = 0;
 
            // count consecutive 1's
            c2++;
        }
        if (c1 == m || c2 == m)
            return true;
    }
    return false;
}
 
// Drivers Code
int main()
{
    string s = "001001";
    int m = 2;
 
    // function call
    if (check(s, m))
        cout << "YES";
    else
        cout << "NO";
 
    return 0;
}