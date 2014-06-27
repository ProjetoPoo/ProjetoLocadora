ALTER TABLE locacao DROP FOREIGN KEY locacao_ibfk_2;
ALTER TABLE locacao MODIFY dependente int(10) null;