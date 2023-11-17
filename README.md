# Game List
Esse projeto é uma API desenvolvida com Java e Spring Boot que fornece uma coleçõa de jogos, onde cada jogo possui diferentes tipos de informações, bem como um gênero onde ele se aplica.

A API atualmente fornece os seguintes endpoints:

✅ `/games` - Esse endpoint retorna todos os jogos cadastrados no banco de dados, sem nenhum tipo de filtragem e com informações reduzidas;

✅ `/games/{id}` - Esse endpoint retorna um único jogo que é buscado através do id passado na url e fornece todas as informações do jogo;

✅ `/lists/{id}/games` - Esse endpoint retorna todos os jogos cadastrados que estão relacionados com a categoria que é escolhida pelo id, passado na url;

✅ `/lists` - Esse endpoint retorna a lista de todas as categorias de jogos cadastradas no banco de dados, fornecendo o id de cada categoria e o nome dela

Através do campo position da tabela belonging provida pela API, é possível inclusive ordenar os jogos dentro do seu respectivo gênero de maneira específica.
