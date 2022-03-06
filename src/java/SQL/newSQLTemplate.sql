/**
 * Author:  lukaz
 * Created: 06/03/2022
 */
-- CONSULTA FOLIAO/SETOR/EVENTO--
select f.nome as Foliao, i.setor as Setor, e.nome as Evento
from foliao as f, evento as e, ingresso as i, foliao_ingresso as fi
where f.id=fi.foliao_id and i.id=ingressos_id and e.id=i.evento_id;


