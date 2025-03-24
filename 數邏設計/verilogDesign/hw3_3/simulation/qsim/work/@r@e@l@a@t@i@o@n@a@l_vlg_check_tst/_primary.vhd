library verilog;
use verilog.vl_types.all;
entity RELATIONAL_vlg_check_tst is
    port(
        CEQV            : in     vl_logic;
        CNOT_EQV        : in     vl_logic;
        EQV             : in     vl_logic;
        NOT_EQV         : in     vl_logic;
        sampler_rx      : in     vl_logic
    );
end RELATIONAL_vlg_check_tst;
