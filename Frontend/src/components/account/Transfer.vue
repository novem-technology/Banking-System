<template>
  <div>
    <ul class="list-group list-group-flush panel">
      <li class="list-group-heading">
        <h3>Transfer Money</h3>
      </li>
      <li class="list-group-item">
        <div class="form-group">
          <label for="usr">Account Number:</label>
          <input type="text" class="form-control" id="usr">
        </div>
        <div class="form-group">
          <label for="usr">Amount:</label>
          <input type="text" class="form-control" id="usr">
        </div>
        <a class="btn btn-primary" href="/account">Transfer</a>
      </li>
    </ul>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

@Component
export default class Tranfer extends Vue {
}
</script>

<style lang="scss">
.list-group-heading {
  list-style-type: none;
}

.list-group-item {
  padding: 10px !important;
  padding-bottom: 10px !important;
}

li p {
  margin: 0;
  padding: 0;
}
</style>
