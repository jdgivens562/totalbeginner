#ifndef SB_CLIENTINFOAPI_CPP
#define SB_CLIENTINFOAPI_CPP

#include<iostream>
#include<stdlib.h>
#include<string>
#include<string.h>
#include "ClientInfoAPI.h"

using namespace std;

string cuppsInfo;
string aireInfo;
string p;


string ClientInfoAPI(){


	//string p;


class ClientInfoAPI {


	string ClientInfoAPI::getProvider(string p){

			string provider = p ;		
	

	if (getenv("CUPPSCN") != NULL){

		provider = "CUPPS";		
		getProviderInfo(p);

	}

	else (getenv("WSID") != NULL); {

		provider = "AIRINC";
		getProviderInfo(p);

	}
	
	return p;


}

void ClientInfoAPI::getProviderInfo(string p){

	

	if (getenv("CUPPSCN") != NULL) {
		p = cuppsInfo;

		}

	else (getenv("WSID") != NULL);{

		p = aireInfo;
		
	}

 }	



	
	};

return 0;

};




int main (){

	string value = ClientInfoAPI();
	cout<< value << "\n";

	return 0;

}


#endif

