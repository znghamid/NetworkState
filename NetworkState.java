public class NetworkState {

    public boolean isNetworkConnected(Context ctx) {

        NetworkInfo info = (NetworkInfo) ((ConnectivityManager) ctx

                .getSystemService(Context.CONNECTIVITY_SERVICE))

                .getActiveNetworkInfo();

        if (info == null || !info.isConnected()) {

            return false;

        }

        return true;

    }

}
