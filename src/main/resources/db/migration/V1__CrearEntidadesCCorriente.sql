CREATE TABLE forma_pago
(
    id          INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    observacion VARCHAR(100)
);

CREATE TABLE pago
(
    id            INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha_pago    DATETIME         NOT NULL,
    forma_pago_id INTEGER UNSIGNED NOT NULL,
    id_cliente    INTEGER UNSIGNED NOT NULL,
    CONSTRAINT fk_forma_pago_pago FOREIGN KEY (forma_pago_id) REFERENCES forma_pago (id)
);

CREATE TABLE cheque
(
    id          INTEGER UNSIGNED NOT NULL PRIMARY KEY,
    nro_cheque  INTEGER          NOT NULL,
    fecha_cobro DATETIME         NOT NULL,
    banco       VARCHAR(50)      NOT NULL,
    CONSTRAINT fk_forma_pago_cheque FOREIGN KEY (id) REFERENCES forma_pago (id)
);

CREATE TABLE efectivo
(
    id         INTEGER UNSIGNED NOT NULL PRIMARY KEY,
    nro_recibo INTEGER          NOT NULL,
    CONSTRAINT fk_forma_pago_efectivo FOREIGN KEY (id) REFERENCES forma_pago (id)
);

CREATE TABLE transferencia
(
    id                   INTEGER UNSIGNED NOT NULL PRIMARY KEY,
    cbu_origen           VARCHAR(22)      NOT NULL,
    cbu_destino          VARCHAR(22)      NOT NULL,
    codigo_transferencia BIGINT           NOT NULL,
    CONSTRAINT fk_forma_pago_transferencia FOREIGN KEY (id) REFERENCES forma_pago (id)

);
