## Client CRUD

- Create a Client:
```shell
curl -X POST http://localhost:8080/clients -H "Content-Type: application/json" -d '{"nom": "Doe", "prenom": "John"}'
```

- Get All Clients:
```shell
curl -X POST http://localhost:8080/clients -H "Content-Type: application/json" -d '{"nom": "Doe", "prenom": "John"}'
```

- Update a Client
```shell
curl -X POST http://localhost:8080/clients -H "Content-Type: application/json" -d '{"nom": "Doe", "prenom": "John"}'
```

- Delete a Client
```shell
curl -X DELETE http://localhost:8080/clients/1
```

## Product

- Create a Product
```shell
curl -X DELETE http://localhost:8080/clients/1
```

- Get All Produits
```shell
curl -X GET http://localhost:8080/produits
```

- Get Produits by Fournisseur
```shell
curl -X GET http://localhost:8080/produits/fournisseur/1
```

- Update a Produit
```shell
curl -X PUT http://localhost:8080/produits/1 -H "Content-Type: application/json" -d '{"nomProd": "Product2", "quantiteStock": 50, "prix": 39.99, "fournisseur": {"idFour": 1}}'
```

- Delete a Produit
```shell
curl -X DELETE http://localhost:8080/produits/1
```

## Commande

- Create a Commande
```shell
curl -X POST http://localhost:8080/commandes -H "Content-Type: application/json" -d '{"dateCMD": "2024-06-22", "client": {"idClient": 1}}'
```

- Get All Commandes
```shell
curl -X GET http://localhost:8080/commandes
```

- Get Commandes by Client
```shell
curl -X GET http://localhost:8080/commandes/client/1
```

- Update a Commande
```shell
curl -X PUT http://localhost:8080/commandes/1 -H "Content-Type: application/json" -d '{"dateCMD": "2023-02-01", "client": {"idClient": 1}}'
```

- Delete a Commande
```shell
curl -X DELETE http://localhost:8080/commandes/1
```

## LigneCMD CRUD

- Create a LigneCMD
```shell
curl -X POST http://localhost:8080/lignecmds -H "Content-Type: application/json" -d '{"quantite": 10, "commande": {"idCMD": 1}, "produit": {"idProd": 1}}'
```

- Get All LigneCMDs
```shell
curl -X GET http://localhost:8080/lignecmds
```

- Get LigneCMDs by Commande
```shell
curl -X GET http://localhost:8080/lignecmds/commande/1
```