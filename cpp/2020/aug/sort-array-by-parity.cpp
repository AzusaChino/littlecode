#include <vector>

using namespace std;

vector<int> sortArrayByParity(vector<int> &A) {
    for(int i=0,j=0;j<A.size(); j++){
        if ((A[j] & 1 == 0)) {
            swap(A[i++], A[j]);
        }
    }
    return A;
}