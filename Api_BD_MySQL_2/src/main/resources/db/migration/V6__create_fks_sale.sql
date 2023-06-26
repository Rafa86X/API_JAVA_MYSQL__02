alter table sales add constraint fk_sale_product foreign key (cod_product) references product (id);
alter table sales add constraint fk_sale_saller foreign key (cod_saler) references sellers (id);
alter table sales add constraint fk_sale_client foreign key (cod_client) references customers (id);